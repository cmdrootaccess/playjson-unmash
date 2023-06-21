# playjson-unmash

provides JSON (un)marshalling support for [Akka HTTP](https://github.com/akka/akka-http)

## Usage
``` scala
final class AboutUs with PlayJsonSupport {

  override def routes: Route = path("about") {
    get {
      complete(OK → About("There is no patch for stupidity"))
    }
  }
}
```