// @SOURCE:C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/conf/routes
// @HASH:191a7ed9125b9c5dc1a13562fa1c2dfc96283381
// @DATE:Thu May 25 02:20:34 IRKT 2017


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Auth_login0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:7
private[this] lazy val controllers_Auth_signup1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:8
private[this] lazy val controllers_Auth_auth2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:9
private[this] lazy val controllers_Auth_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:10
private[this] lazy val controllers_Auth_register4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:11
private[this] lazy val controllers_Admin_profile5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:12
private[this] lazy val controllers_Admin_changePassword6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile/change"))))
        

// @LINE:13
private[this] lazy val controllers_Application_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:14
private[this] lazy val controllers_Application_upload8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:15
private[this] lazy val controllers_AmazonUpload_index9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("uplode"))))
        

// @LINE:16
private[this] lazy val controllers_EasyAccess_search10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("easyAccess/"),DynamicPart("easySearch", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_AmazonUpload_upload11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/upload"))))
        

// @LINE:21
private[this] lazy val controllers_AmazonUpload_getInfo12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/uploads"))))
        

// @LINE:26
private[this] lazy val controllers_AmazonUpload_jsRoutes13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/jsRoutes"))))
        

// @LINE:29
private[this] lazy val controllers_Assets_at14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Auth.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Auth.signup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Auth.auth()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Auth.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Auth.register()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Admin.profile()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile/change""","""controllers.Admin.changePassword()"""),("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix,"""controllers.Application.upload()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """uplode""","""controllers.AmazonUpload.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """easyAccess/$easySearch<[^/]+>""","""controllers.EasyAccess.search(easySearch:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/upload""","""controllers.AmazonUpload.upload()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/uploads""","""controllers.AmazonUpload.getInfo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/jsRoutes""","""controllers.AmazonUpload.jsRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Auth_login0(params) => {
   call { 
        invokeHandler(controllers.Auth.login(), HandlerDef(this, "controllers.Auth", "login", Nil,"GET", """ Home page""", Routes.prefix + """login"""))
   }
}
        

// @LINE:7
case controllers_Auth_signup1(params) => {
   call { 
        invokeHandler(controllers.Auth.signup(), HandlerDef(this, "controllers.Auth", "signup", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:8
case controllers_Auth_auth2(params) => {
   call { 
        invokeHandler(controllers.Auth.auth(), HandlerDef(this, "controllers.Auth", "auth", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:9
case controllers_Auth_logout3(params) => {
   call { 
        invokeHandler(controllers.Auth.logout(), HandlerDef(this, "controllers.Auth", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:10
case controllers_Auth_register4(params) => {
   call { 
        invokeHandler(controllers.Auth.register(), HandlerDef(this, "controllers.Auth", "register", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:11
case controllers_Admin_profile5(params) => {
   call { 
        invokeHandler(controllers.Admin.profile(), HandlerDef(this, "controllers.Admin", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:12
case controllers_Admin_changePassword6(params) => {
   call { 
        invokeHandler(controllers.Admin.changePassword(), HandlerDef(this, "controllers.Admin", "changePassword", Nil,"POST", """""", Routes.prefix + """profile/change"""))
   }
}
        

// @LINE:13
case controllers_Application_index7(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:14
case controllers_Application_upload8(params) => {
   call { 
        invokeHandler(controllers.Application.upload(), HandlerDef(this, "controllers.Application", "upload", Nil,"POST", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:15
case controllers_AmazonUpload_index9(params) => {
   call { 
        invokeHandler(controllers.AmazonUpload.index(), HandlerDef(this, "controllers.AmazonUpload", "index", Nil,"GET", """""", Routes.prefix + """uplode"""))
   }
}
        

// @LINE:16
case controllers_EasyAccess_search10(params) => {
   call(params.fromPath[String]("easySearch", None)) { (easySearch) =>
        invokeHandler(controllers.EasyAccess.search(easySearch), HandlerDef(this, "controllers.EasyAccess", "search", Seq(classOf[String]),"GET", """""", Routes.prefix + """easyAccess/$easySearch<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_AmazonUpload_upload11(params) => {
   call { 
        invokeHandler(controllers.AmazonUpload.upload(), HandlerDef(this, "controllers.AmazonUpload", "upload", Nil,"GET", """API""", Routes.prefix + """api/upload"""))
   }
}
        

// @LINE:21
case controllers_AmazonUpload_getInfo12(params) => {
   call { 
        invokeHandler(controllers.AmazonUpload.getInfo(), HandlerDef(this, "controllers.AmazonUpload", "getInfo", Nil,"GET", """""", Routes.prefix + """api/uploads"""))
   }
}
        

// @LINE:26
case controllers_AmazonUpload_jsRoutes13(params) => {
   call { 
        invokeHandler(controllers.AmazonUpload.jsRoutes, HandlerDef(this, "controllers.AmazonUpload", "jsRoutes", Nil,"GET", """""", Routes.prefix + """api/jsRoutes"""))
   }
}
        

// @LINE:29
case controllers_Assets_at14(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     