import kotlinx.coroutines.*

suspend fun main(){
    try{
        var x1: XClass = XClass()
        var K = x1.Input()
        GlobalScope.launch {
            for(i in 1..K){
                println("$i раз")
                x1.Xresearch()
            }
        }
        runBlocking { delay(30000L) }
    }catch (e:Exception){
        println("НК данные")
    }
}