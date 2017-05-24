// @SOURCE:C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/conf/routes
// @HASH:191a7ed9125b9c5dc1a13562fa1c2dfc96283381
// @DATE:Thu May 25 02:20:34 IRKT 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:29
// @LINE:26
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

// @LINE:29
class ReverseAssets {
    

// @LINE:29
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
def search(easySearch:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "easyAccess/" + implicitly[PathBindable[String]].unbind("easySearch", dynamicString(easySearch)))
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
class ReverseApplication {
    

// @LINE:14
def upload(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:13
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:26
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
   Call("GET", _prefix + { _defaultPrefix } + "api/upload")
}
                                                

// @LINE:15
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "uplode")
}
                                                

// @LINE:26
def jsRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/jsRoutes")
}
                                                
    
}
                          
}
                  


// @LINE:29
// @LINE:26
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

// @LINE:29
class ReverseAssets {
    

// @LINE:29
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
      function(easySearch) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "easyAccess/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("easySearch", encodeURIComponent(easySearch))})
      }
   """
)
                        
    
}
              

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
              

// @LINE:26
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
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/upload"})
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
                        

// @LINE:26
def jsRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AmazonUpload.jsRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/jsRoutes"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:29
// @LINE:26
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


// @LINE:29
class ReverseAssets {
    

// @LINE:29
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
def search(easySearch:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EasyAccess.search(easySearch), HandlerDef(this, "controllers.EasyAccess", "search", Seq(classOf[String]), "GET", """""", _prefix + """easyAccess/$easySearch<[^/]+>""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
class ReverseApplication {
    

// @LINE:14
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.upload(), HandlerDef(this, "controllers.Application", "upload", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:13
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:26
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
   controllers.AmazonUpload.upload(), HandlerDef(this, "controllers.AmazonUpload", "upload", Seq(), "GET", """API""", _prefix + """api/upload""")
)
                      

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.index(), HandlerDef(this, "controllers.AmazonUpload", "index", Seq(), "GET", """""", _prefix + """uplode""")
)
                      

// @LINE:26
def jsRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.jsRoutes(), HandlerDef(this, "controllers.AmazonUpload", "jsRoutes", Seq(), "GET", """""", _prefix + """api/jsRoutes""")
)
                      
    
}
                          
}
        
    