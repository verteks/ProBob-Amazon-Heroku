
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
object easyAccessList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.S3File],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(s3Files: List[models.S3File]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

    """),_display_(Seq[Any](/*3.6*/main("Easy Access")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    <h1>Uploads:</h1>
    <ul>
    """),_display_(Seq[Any](/*7.6*/for(s3file <- s3Files) yield /*7.28*/ {_display_(Seq[Any](format.raw/*7.30*/("""
        <li><a href=""""),_display_(Seq[Any](/*8.23*/s3file/*8.29*/.getUrl())),format.raw/*8.38*/("""">"""),_display_(Seq[Any](/*8.41*/s3file/*8.47*/.getName())),format.raw/*8.57*/("""</a></li>
    """)))})),format.raw/*9.6*/("""
    </ul>
    """)))})),format.raw/*11.6*/("""
"""))}
    }
    
    def render(s3Files:List[models.S3File]): play.api.templates.HtmlFormat.Appendable = apply(s3Files)
    
    def f:((List[models.S3File]) => play.api.templates.HtmlFormat.Appendable) = (s3Files) => apply(s3Files)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 26 22:40:59 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/easyAccessList.scala.html
                    HASH: 7af402efb7a5f7b659e552d7fa91f45381e5dc0c
                    MATRIX: 796->1|920->31|963->40|990->59|1029->61|1105->103|1142->125|1181->127|1240->151|1254->157|1284->166|1322->169|1336->175|1367->185|1413->201|1462->219
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|36->8|36->8|36->8|36->8|37->9|39->11
                    -- GENERATED --
                */
            