
val pattern = "^Sca".r
val str = "Scalable scala is Scalable and cool!"

println(pattern.findAllMatchIn(str))
println(pattern.replaceAllIn(str,"Java"))

