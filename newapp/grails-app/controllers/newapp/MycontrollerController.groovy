package newapp

class MycontrollerController {
    def index() {

      render view: "/mycontroller/myview", model: []
    }
    def show(){

      def line = "Hi $params.name, you are very welcome here!"
      render view: "/mycontroller/myview", model: [line:line]
    }

}
