// @SOURCE:C:/playHero/play-2.2.6/play-2.2.6/ProBob-Amazon-Heroku/conf/routes
// @HASH:4b5c2a2af6fbde47452ae2ce5872bbf7dbd064d5
// @DATE:Fri May 19 11:09:17 IRKT 2017

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
                          

// @LINE:13
// @LINE:12
class ReverseAdmin {
    

// @LINE:12
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:13
def changePassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "profile/change")
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseAuth {
    

// @LINE:9
def auth(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:7
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:10
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:11
def register(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:6
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:8
class ReverseApplication {
    

// @LINE:15
def upload(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:14
def index1(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:8
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "news")
}
                                                
    
}
                          

// @LINE:26
// @LINE:21
// @LINE:20
// @LINE:16
class ReverseAmazonUpload {
    

// @LINE:21
def getInfo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/uploads")
}
                                                

// @LINE:20
def upload(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/upload")
}
                                                

// @LINE:16
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
              

// @LINE:13
// @LINE:12
class ReverseAdmin {
    

// @LINE:12
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:13
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.changePassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/change"})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseAuth {
    

// @LINE:9
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
                        

// @LINE:10
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:11
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
              

// @LINE:15
// @LINE:14
// @LINE:8
class ReverseApplication {
    

// @LINE:15
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:14
def index1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news"})
      }
   """
)
                        
    
}
              

// @LINE:26
// @LINE:21
// @LINE:20
// @LINE:16
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
                        

// @LINE:16
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
                          

// @LINE:13
// @LINE:12
class ReverseAdmin {
    

// @LINE:12
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.profile(), HandlerDef(this, "controllers.Admin", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:13
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.changePassword(), HandlerDef(this, "controllers.Admin", "changePassword", Seq(), "POST", """""", _prefix + """profile/change""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseAuth {
    

// @LINE:9
def auth(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.auth(), HandlerDef(this, "controllers.Auth", "auth", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.signup(), HandlerDef(this, "controllers.Auth", "signup", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:10
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.logout(), HandlerDef(this, "controllers.Auth", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:11
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.register(), HandlerDef(this, "controllers.Auth", "register", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.login(), HandlerDef(this, "controllers.Auth", "login", Seq(), "GET", """ Home page""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:8
class ReverseApplication {
    

// @LINE:15
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.upload(), HandlerDef(this, "controllers.Application", "upload", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:14
def index1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index1(), HandlerDef(this, "controllers.Application", "index1", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """news""")
)
                      
    
}
                          

// @LINE:26
// @LINE:21
// @LINE:20
// @LINE:16
class ReverseAmazonUpload {
    

// @LINE:21
def getInfo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.getInfo(), HandlerDef(this, "controllers.AmazonUpload", "getInfo", Seq(), "GET", """""", _prefix + """api/uploads""")
)
                      

// @LINE:20
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.upload(), HandlerDef(this, "controllers.AmazonUpload", "upload", Seq(), "GET", """API""", _prefix + """api/upload""")
)
                      

// @LINE:16
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.index(), HandlerDef(this, "controllers.AmazonUpload", "index", Seq(), "GET", """""", _prefix + """uplode""")
)
                      

// @LINE:26
def jsRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AmazonUpload.jsRoutes(), HandlerDef(this, "controllers.AmazonUpload", "jsRoutes", Seq(), "GET", """""", _prefix + """api/jsRoutes""")
)
                      
    
}
                          
}
        
    