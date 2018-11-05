package TestProject

fun main(args: Array<String>)
{
    //DisplayClassCaller()
    //RangeExampleCaller()
    //IfasExpressionCaller()
    //WhenAsExpressionCaller()
    //loopsIterationCaller()
    breakStatementCaller()
}

fun displayClassCaller()
{
    var DisplayClass1obj= DisplayClass1()
    DisplayClass1obj.StudentName="Amaladoss"
    DisplayClass1obj.DisplayString()
    var HelloWorldobj=HelloWorld("Prince")
    HelloWorldobj.DisplayPersonName()
}

fun rangeExampleCaller()
{
    var RangeExampleobj = RangeExample()
    RangeExampleobj.DisplayRangeExe()
}

fun ifasExpressionCaller()
{
    var IfasExpressionobj=IfasExpression()
    IfasExpressionobj.CheckGreaterValue()
}

fun whenAsExpressionCaller()
{
    var whenAsExpressionobj= WhenAsExpression()
    whenAsExpressionobj.PrintValueOfX()
}

fun loopsIterationCaller()
{
    var loopsIteration= LoopsIteration()
    loopsIteration.printIntegers()
}

fun breakStatementCaller()
{
    var BreakStatementobj= BreakStatement()
    BreakStatementobj.EecuteBreak()
}

class DisplayClass1
{
    var StudentName:String="Amal"

    fun DisplayString()
    {
        println("The Employee Name is $`{StudentName}")
    }
}

class RangeExample {
    var i = 1..5
    var j = 5 downTo 1
    var stepdownexe = 10 downTo 1 step 3

    var str = "a".rangeTo("z")

    var str1 = 'z'.downTo('a') step 2

    fun DisplayRangeExe() {
        println("Integer Range $i")
        println("Integer Range Reverse $j")
        println("Integer Range StepDown $stepdownexe")
        println("String Range $str")
        println("String Range StepDown $str1")

        println("Y present in str ${"y" in str}")

    }
}

class IfasExpression
{
    var a:Int= 5
    var b:Int=12

    fun CheckGreaterValue(){
        var MaxValue:Int = if(a>b) {
                            println("A is greater than B")
                            a
                        }
                        else
                        {
                            println("B is Greater than A")
                            b
                        }
        println("The Max Value is ${MaxValue}")

    }
}


class WhenAsExpression {
    var x: Int = 10
    var y:Int=x
    fun PrintValueOfX() {
        when (x) {
            1 -> println("Value of X is 1")
            2 -> println("Value of X is 2")
            in 1..10 -> println("Value of X lies between 1 to 10")
            10 -> println("Value of X is 10")
            in 100..110 -> println("Value of X lies between 100 to 110")
            !in 200..210 -> println("Value of X lies between 200 to 210")
            else -> println("Value of x is UnKnown")
        }

       var str:String= when (y) {
           1 -> "Value of Y is 1"
           2 -> "Value of y is 2"
           in 100..110 -> "Value of Y lies between 100 to 110"
           !in 200..210 ->"Value of y lies between 200 to 210"
           else -> "Value of Y is UnKnown"
       }
       println(str)
    }
}


class LoopsIteration{

    fun printIntegers() {
        println("Checking For Loop")
        for (i in 1..5) {
            println("Value of I is ${i}")
        }

        println("Checking While Loop")

        var j: Int = 10
        while (j > 6) {
            println("Value of J $j")
            j--
        }

        println("Checking Do While Loop")

        var k: Int = 50
        do {
            println("Value of K is $k")
            k--
        } while (k > 45)
    }
}


class BreakStatement{

    fun EecuteBreak(){
        for(i in 1..3){
            println(i);
            if (i==2)
            break;
        }

       MyLoop@ for(j in 1..5)
        {
            for (k in 1..3 )
            {
                println("$j $k")
                 if(j==2 && k==2)
                     break@MyLoop
            }
        }

    }
}