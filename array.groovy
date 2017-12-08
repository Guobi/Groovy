String[] testArray = ["A", "B", "C"]
println testArray.length
println testArray.class


def myList =  ["A", "B", "C"]
println myList.size()
println myList.class
myList.each
{
    try
    {
        println it
        4/0
    }
    // catch(all)
    // catch (Exception e)
    catch (e)
    {
        println e
        // e.printStackTrace()
    }
    finally
    {
         println("The final block");
    }
}

def myList2 =  [1, 2, 0, 3, 0]
for (int i = 0;i<myList2.size();i++)
{
    try
    {
        println 1/myList2[i]
    }
    catch (e)
    {
        println e
    }
    finally
    {
        println("The final block");
    }
}
