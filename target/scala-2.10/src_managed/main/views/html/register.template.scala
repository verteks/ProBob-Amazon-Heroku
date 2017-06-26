
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Register],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(regForm: Form[Register]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""
    """),_display_(Seq[Any](/*2.6*/main("Регистрация")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
        """),_display_(Seq[Any](/*3.10*/if(regForm.hasErrors)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
            <div class="alert alert-danger">
                <a class="close" data-dismiss="alert">x</a>
                """),_display_(Seq[Any](/*6.18*/if(regForm.errors.size() > 0)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
                    """),_display_(Seq[Any](/*7.22*/for((key, value) <- regForm.errors) yield /*7.57*/ {_display_(Seq[Any](format.raw/*7.59*/("""
                        """),_display_(Seq[Any](/*8.26*/for(err <- value) yield /*8.43*/ {_display_(Seq[Any](format.raw/*8.45*/("""
                            <p>"""),_display_(Seq[Any](/*9.33*/err/*9.36*/.message().toString())),format.raw/*9.57*/("""</p>
                        """)))})),format.raw/*10.26*/("""
                    """)))})),format.raw/*11.22*/("""
                """)))})),format.raw/*12.18*/("""
            </div>
        """)))})),format.raw/*14.10*/("""
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Auth.register())/*15.45*/ {_display_(Seq[Any](format.raw/*15.47*/("""

            <h2 class="form-signin-heading">Регистрация</h2>

            """),_display_(Seq[Any](/*19.14*/input(regForm("email"), "Email", 'type -> "email", 'class -> "regPad"))),format.raw/*19.84*/("""
            """),_display_(Seq[Any](/*20.14*/input(regForm("password"), "Пароль", 'type -> "password", 'class -> "regPad"))),format.raw/*20.91*/("""
            """),_display_(Seq[Any](/*21.14*/input(regForm("easyAccess"),"easy access",'type -> "text", 'class -> "regPad"))),format.raw/*21.92*/("""
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Зарегистрироваться</button>
            </div>
        """)))})),format.raw/*25.10*/("""
    """)))})))}
    }
    
    def render(regForm:Form[Register]): play.api.templates.HtmlFormat.Appendable = apply(regForm)
    
    def f:((Form[Register]) => play.api.templates.HtmlFormat.Appendable) = (regForm) => apply(regForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 26 22:25:07 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/register.scala.html
                    HASH: 601c3daba7b3b904222f66cb97501984b896ceeb
                    MATRIX: 785->1|904->26|945->33|972->52|1011->54|1057->65|1086->86|1125->88|1286->214|1323->243|1362->245|1420->268|1470->303|1509->305|1571->332|1603->349|1642->351|1711->385|1722->388|1764->409|1827->440|1882->463|1933->482|1996->513|2043->524|2058->530|2096->559|2136->561|2253->642|2345->712|2396->727|2495->804|2546->819|2646->897|2838->1057
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|40->12|42->14|43->15|43->15|43->15|43->15|47->19|47->19|48->20|48->20|49->21|49->21|53->25
                    -- GENERATED --
                */
            