package com.example

class HelloWorld {
    def script
    HelloWorld(script){
        this.script = script
    }
    def sayGoodMorning(){
        script.echo "=========GOOD MORNING+++++++++++"
    }
}
