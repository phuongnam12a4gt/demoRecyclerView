package model

open class A
{
    open fun foo(i:Int=10)
    {
        println(i)
    }
}
class B:A()
{
    override fun foo(i: Int) {
        println(i)
    }
}