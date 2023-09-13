package com.zaghir.project.groovy

 l = [1 , 2 , 3]
println l
println l.getClass()
println "-------------------------------"
LinkedList ll =  [1 , 2 , 3]
println ll
println ll.class
println "-------------------------------"
l << 4
println l
println "-------------------------------"
l = l + [4 , 5 , 6]
println l
println "-------------------------------"
l = l - [2 ,5]
println l
println "-------------------------------"

l.each { println(it)}
println "-------------------------------"
l.reverseEach { println( it)}
println "-------------------------------"
l.eachPermutation { println( it)}
println "-------------------------------"

