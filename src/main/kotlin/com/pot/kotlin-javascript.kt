package com.pot

import kotlin.browser.*
import kotlinx.html.*
import kotlinx.html.dom.*
import kotlinx.html.stream.createHTML

import com.pot.factorial
import kotlinx.html.js.onClickFunction

fun printHello() {
	window.onload = {
		document.body!!.append {
			h1 { +"🐍 Snake" }
			div {
				id = "container"
				style = "color: green"
				+"Here is container"
			}
			button {
				+"Click me Bro!"
				onClickFunction = { event -> onButtonClick(event) }
			}
		}
	}

	var counter = 0

	window.setInterval({
		val myDiv = document.create.div("panel") {
			p {
				+"Here is "
				a("http://kotlinlang.org") { +"official Kotlin site" }
			}
		}

		val fac = factorial(++counter)

		document.getElementById("container")!!
				.appendChild(myDiv)
				.append {
					div {
						+"Factorial of $counter is $fac"
					}
				}

		println(createHTML().div { +"New Div" })
	}, 5_000)
}

fun onButtonClick(event: Any) {
	println(event)
}

fun main(args: Array<String>) {
	printHello()
}
