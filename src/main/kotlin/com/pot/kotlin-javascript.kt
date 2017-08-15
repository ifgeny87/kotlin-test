package com.pot

import kotlin.browser.*
import kotlinx.html.*
import kotlinx.html.dom.*
import kotlinx.html.js.onClickFunction
import kotlinx.html.stream.createHTML
import kotlin.js.Date

/**
 * Точка старта
 */
fun main(args: Array<String>) {
	printHello()
}

fun printHello() {
	// пример создания div :: String Type
	val div1 = createHTML().div {
		id = "test-div"
		+"hello"
	}

	// подписываемся на загрузку window
	window.onload = {
		document.body!!
				.append {
					h1 { +"🐍 Snake" }
					div {
						+"Div text = "
						+div1
					}
					div {
						id = "container"
						style = "color: red"
						+"Here is container"
					}
					button {
						+"Click me Bro!"
						onClickFunction = { event -> onButtonClick(event) }
					}
				}

		nextTick()
	}
}

fun nextTick() {
	window.setTimeout(tick, counter * counter * 1_000)
}

var counter = 0

val tick = {
	counter++

	val div2 = document.create.div("panel") {
		blockQuote {
			+"Here is "
			a("http://kotlinlang.org") { +"official Kotlin site" }
			br
			+"Factorial of $counter is ${factorial(counter)}"
		}
	}

	document.getElementById("container")
			?.appendChild(div2)
			?.append {
				div {
					+"added at $counter"
				}
			}

	println("tick-tack " + Date())

	nextTick()
}

fun onButtonClick(event: Any) {
	window.alert("Something in log")
	// просто выводит текст
	println(event)
	// выводит объект, как привыкли
	console.log(event)
}