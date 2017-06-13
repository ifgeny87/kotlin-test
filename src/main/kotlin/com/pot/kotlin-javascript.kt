package com.pot

import kotlin.browser.*
import kotlinx.html.*
import kotlinx.html.dom.*
import kotlinx.html.stream.createHTML

fun printHello() {
	window.onload = {
		document.body!!.append {
			div {
				id = "container"
				style = "color: green"
				+"Here is container"
			}
		}
	}

	var counter = 0

	window.setInterval({
		counter++

		val myDiv = document.create.div("panel") {
			p {
				+"Here is "
				a("http://kotlinlang.org") { +"official Kotlin site" }
			}
		}

		document.getElementById("container")!!
				.appendChild(myDiv)
				.append {
					div {
						+"added at $counter"
					}
				}

		println(createHTML().div { +"New Div" })
	}, 5_000)
}

fun onButtonClick(a: Any) {
	println(a)
}

fun main(args: Array<String>) {
	printHello()
}
