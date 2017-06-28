
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
object easyError extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(str: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.15*/("""
"""),_display_(Seq[Any](/*2.2*/main("Ошибка")/*2.16*/ {_display_(Seq[Any](format.raw/*2.18*/("""
<h2>Упс, возникла проблемка (</h2>
<h4>"""),_display_(Seq[Any](/*4.6*/str)),format.raw/*4.9*/("""</h4>

""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(str:String): play.api.templates.HtmlFormat.Appendable = apply(str)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (str) => apply(str)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 28 22:23:23 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/easyError.scala.html
                    HASH: f9695d0aaeeffe0cd49d51cacdaa5e6cb3c7baf9
                    MATRIX: 778->1|885->14|922->17|944->31|983->33|1060->76|1083->79|1123->89
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|34->6
                    -- GENERATED --
                */
            