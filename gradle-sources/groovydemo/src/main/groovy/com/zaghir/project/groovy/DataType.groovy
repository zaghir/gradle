package com.zaghir.project.groovy

def a = 1

def b = 1.25F

float c = 2

d = 'hello '
println("a : "+ a+" ==>  "+a.class)
println("b : "+ b+" ==>  "+b.class)
println("c : "+ c+" ==>  "+c.class)
println("d : "+ d+" ==>  "+d.class)

d = "hello ${c}"
println("d : "+ d+" ==>  "+d.class)

e = '''
Write all you need 
you dont have to add \n
'''
println("e : "+ e)

//emailRegularExpression = //
emailRegularExpression = /^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$/
println("emailRegularExpression : "+ emailRegularExpression+" ==>  "+emailRegularExpression.getClass())
println "test@gmail.com" ==~ emailRegularExpression