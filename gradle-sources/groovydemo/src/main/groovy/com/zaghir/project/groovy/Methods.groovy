package com.zaghir.project.groovy

// def product( x , y ){
int product( int x , int y ){
   x*y
}

result = product  2 , 3
println result

int productDefaultvalue( int x = 1, int y ){
    x*y
}

result = productDefaultvalue   3
println result

void display (Map productionDetails){
    println "name : ${productionDetails.name} , price: ${productionDetails.price}"

}
display([name: "Raspbery3" , price: 50.0])
display(price: 25.0 , name: "Orangebery3")

