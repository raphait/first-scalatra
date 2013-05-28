package com.raphaelalmeida.first

import org.scalatra._
import scalate.ScalateSupport

class First extends FirstScalatraStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, classy Scalatra!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/oi") {
    "Irado \\m/"
  }
  
}
