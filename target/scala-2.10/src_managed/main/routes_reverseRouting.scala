// @SOURCE:C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/conf/routes
// @HASH:65265be616a4eed500cd811c14c451e66c069db7
// @DATE:Mon Jun 26 22:25:05 IRKT 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:33
class ReverseAssets {
    

// @LINE:33
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
class ReverseAdmin {
    

// @LINE:11
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:12
def changePassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "profile/change")
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAuth {
    

// @LINE:8
def auth(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:7
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:9
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:10
def register(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:6
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:16
class ReverseEasyAccess {
    

// @LINE:16
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "easyAccess")
}
                                                
    
}
                          

// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:14
// @LINE:13
class ReverseApplication {
    

// @LINE:14
def upload(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:25
def filesJson(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/upload")
}
                                                

// @LINE:30
def jsRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/jsRoutes")
}
                                                

// @LINE:27
def changeEasyAccess(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/EA")
}
                                                

// @LINE:26
def deleteFileJson(): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "api/files")
}
                                                

// @LINE:13
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:15
class ReverseAmazonUpload {
    

// @LINE:21
def getInfo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/uploads")
}
                                                

// @LINE:20
def upload(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/uploadddd")
}
                                                

// @LINE:15
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "uplode")
}
                                                
    
}
                          
}
                  


// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:33
class ReverseAssets {
    

// @LINE:33
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
class ReverseAdmin {
    

// @LINE:11
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:12
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.changePassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/change"})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAuth {
    

// @LINE:8
def auth : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.auth",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:9
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.register",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:16
class ReverseEasyAccess {
    

// @LINE:16
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EasyAccess.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "easyAccess"})
      }
   """
)
                        
    
}
              

// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:14
// @LINE:13
class ReverseApplication {
    

// @LINE:14
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:25
def filesJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.filesJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/upload"})
      }
   """
)
                        

// @LINE:30
def jsRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/jsRoutes"})
      }
   """
)
                        

// @LINE:27
def changeEasyAccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.changeEasyAccess",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/EA"})
      }
   """
)
                        

// @LINE:26
def deleteFileJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteFileJson",
   """
      function() {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/files"})
      }
   """
)
                        

// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
// @LINE:15
class ReverseAmazonUpload {
    

// @LINE:21
def getInfo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AmazonUpload.getInfo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/uploads"})
      }
   """
)
                        

// @LINE:20
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AmazonUpload.upload",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/uploadddd"})
      }
   """
)
                        

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AmazonUpload.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "uplode"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:33
class ReverseAssets {
    

// @LINE:33
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
class ReverseAdmin {
    

// @LINE:11
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.profile(), HandlerDef(this, "controllers.Admin", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:12
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.changePassword(), HandlerDef(this, "controllers.Admin", "changePassword", Seq(), "POST", """""", _prefix + """profile/change""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAuth {
    

// @LINE:8
def auth(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.auth(), HandlerDef(this, "controllers.Auth", "auth", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.signup(), HandlerDef(this, "controllers.Auth", "signup", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:9
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.logout(), HandlerDef(this, "controllers.Auth", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:10
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.register(), HandlerDef(this, "controllers.Auth", "register", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.login(), HandlerDef(this, "controllers.Auth", "login", Seq(), "GET", """ Home page""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:16
class ReverseEasyAccess {
    

// @LINE:16
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EasyAccess.search(), HandlerDef(this, "controllers.EasyAccess", "search", Seq(), "GET", """""", _prefix + """easyAccess""")
)
                      
    
}
                          

// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:14
// @LINE:13
class ReverseApplication {
    

// @LINE:14
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.upload(), HandlerDef(this, "controllers.Application", "upload", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:25
def filesJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.filesJson(), HandlerDef(this, "controllers.Application", "filesJson", Seq(), "GET", """POST    /api/notes                  controllers.Application.saveNoteJson()
PUT     /api/notes                  controllers.Application.saveNoteJson()
DELETE  /api/notes                  controllers.Application.deleteNoteJson()""", _prefix + """api/upload""")
)
                      

// @LINE:30
def jsRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsRoutes(), HandlerDef(this, "controllers.Application", "jsRoutes", Seq(), "GET", """""", _prefix + """api/jsRoutes""")
)
                      

// @LINE:27
def changeEasyAccess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.changeEasyAccess(), HandlerDef(this, "controllers.Application", "changeEasyAccess", Seq(), "POST", """""", _prefix + """api/EA""")
)
                      

// @LINE:26
def deleteFileJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteFileJson(), HandlerDef(this, "controllers.Application", "deleteFileJson", Seq(), "DELETE", """""", _prefix + """api/files""")
)
                      

// @LINE:13
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:15
class ReverseAmazonUpload {
    

// @LINE:21
def getInfo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.getInfo(), HandlerDef(this, "controllers.AmazonUpload", "getInfo", Seq(), "GET", """""", _prefix + """api/uploads""")
)
                      

// @LINE:20
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.upload(), HandlerDef(this, "controllers.AmazonUpload", "upload", Seq(), "GET", """API""", _prefix + """api/uploadddd""")
)
                      

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.index(), HandlerDef(this, "controllers.AmazonUpload", "index", Seq(), "GET", """""", _prefix + """uplode""")
)
                      
    
}
                          
}
        
    