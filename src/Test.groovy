/**
 * Created by ericgonzales on 10/22/16.
 */
class Test {
    static void main(args){
        println "Hello world!"

        def firstName = 'John'
        def lastName = 'Doe'
        def a = 3
        def b = 7

        println "${lastName}, ${firstName}" //double quoted strings allow for inner expressions to be evaluated
        println "a + b = ${a + b}"
        println '${lastname}' //single quoted strings are normal string

        List javaList = new ArrayList() //List in Java
        def groovyList = [] //List in Groovy
        def oddList = [1, 3, 5, 7, 9] //simple list initalization
        def mixedList = [10, "Test", new Integer(7), new Double(8.3d)] //lists are not strongly typed
        def sports = ["Basketball", "Football", "Baseball"]
        println mixedList[1] //individual items can be accessed by index
        println oddList.size() ///get number of elements
        println oddList.findAll{it % 2 == 0} //closure method
        println sports*.length() //creates a new list by getting the length() of each item

        def emptyMap = [:] //empty map
        def mapWithValues = [baseball:'Braves', basketball:'Hawks', football:'Falcons'] //instance of java.util.Map, all keys are strings by default
        mapWithValues['hockey'] = 'Gladiators' //adds item
        mapWithValues.put('soccer', 'United FC') //adds item
        mapWithValues << [lacrosse:'Swarm'] //adds item
        println mapWithValues['soccer'] //gets item
        println mapWithValues.'hockey' //gets item
        println mapWithValues.get('lacrosse') //gets item

        5.times{
            println "Go Jackets!" //this line will be printed 5 times
        }

        (6..11).each{ number->
            println number //this will print numbers from 6 to 11
        }

        mixedList.each{ name ->
            println name //this will print each element in the list
        }

        mapWithValues.each{ sport, name ->
            println "Atlanta's ${sport} team is the Atlanta ${name}"
        }
    }
}
