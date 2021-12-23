package viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import model.RepositoryImpl
import java.lang.Thread.sleep
import kotlin.IllegalStateException

class MainViewModel(private val  liveData: MutableLiveData <AppState> = MutableLiveData(),
private val repositoryImpl: RepositoryImpl = RepositoryImpl()) : ViewModel() {

    fun getLiveDAta() : LiveData<AppState>{
        return liveData
    }

    fun getWeatherFromServer(){
        liveData.postValue(AppState.Loading(99))
        Thread{

            sleep(3000)
           // liveData.postValue(AppState.Error(IllegalStateException("")))
            val  rand = (-20..40).random()
            if (rand<0){
                liveData.postValue(AppState.Success(repositoryImpl.getWeatherFromServer()))
            }else{
                liveData.postValue(AppState.Error(IllegalStateException("")))
            }



        }.start()
    }
}