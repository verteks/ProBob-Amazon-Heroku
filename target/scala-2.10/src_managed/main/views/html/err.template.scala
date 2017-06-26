
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
object err extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(path: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),_display_(Seq[Any](/*2.2*/main("Ошибка")/*2.16*/ {_display_(Seq[Any](format.raw/*2.18*/("""
<h2>404 Not Found</h2>
<h4>Не найден путь:</h4>
<p>"""),_display_(Seq[Any](/*5.5*/path)),format.raw/*5.9*/("""</p>
""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(path:String): play.api.templates.HtmlFormat.Appendable = apply(path)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (path) => apply(path)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 26 21:55:14 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/err.scala.html
                    HASH: 05a1e9982403cedaa5b1eb3100f0d695a85b3877
                    MATRIX: 772->1|880->15|917->18|939->32|978->34|1068->90|1092->94|1129->101
                    LINES: 26->1|29->1|30->2|30->2|30->2|33->5|33->5|34->6
                    -- GENERATED --
                */
            