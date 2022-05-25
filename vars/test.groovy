#!/usr/bin/env groovy
import com.example.HelloWorld
def call() {
    return new HelloWorld(this).sayGoodMorning()
}