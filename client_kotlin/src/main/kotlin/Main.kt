

// fun main(args: Array<String>) {
//     for (name in args)
//         println("Hello, $name!")
// }

fun main(args: Array<String>){
  println("---- begin ------")
  println("first param: ${args[0]}, number=${args.size}!")

  for (name in args){
      println("$name")
  }
  println("---- over ------")

}