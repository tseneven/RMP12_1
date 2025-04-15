class XClass {
    fun Input():Int{
        println("Введите сколько раз нужно вызвать функцию")
        val n = readln()!!.toInt()
        if(n>0)
        {
            return n
        }
        else
        {
            println("Нельзя вызвать меньше нуля")
            return 1
        }
    }


    fun Xresearch(){
        try{
            println("Введите 1 число")
            val x = readln()!!.toDouble()

            if(x>0)
            {
                val v = x*2
                if(v > 2 && v < 6){
                    val otv1 = x*5
                    println("P=$otv1")
                } else {
                    if(v > 6 && v < 10){
                        val otv2 = (x * 7)%5
                        println("P=$otv2")
                    }else{
                        if(v > 10) {
                            val otv3 = x * 10
                            println("P=$otv3")
                        }
                    }
                }
            }
        }catch (e:Exception){
            println("НК данные")
        }
    }
}