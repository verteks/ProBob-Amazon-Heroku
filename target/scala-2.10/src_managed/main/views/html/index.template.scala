
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.S3File],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(s3Files: List[models.S3File]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""


    """),_display_(Seq[Any](/*4.6*/main("Upload")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""

    <h1>Upload a file:</h1>
    
    """),_display_(Seq[Any](/*8.6*/helper/*8.12*/.form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*8.88*/ {_display_(Seq[Any](format.raw/*8.90*/("""
        <input type="file" name="upload">
        <input type="submit">
        easy access
        <input type="checkbox" name ="easyAccessFile">
    """)))})),format.raw/*13.6*/("""

    <h1>Uploads:</h1>
    <ul>
    """),_display_(Seq[Any](/*17.6*/for(s3file <- s3Files) yield /*17.28*/ {_display_(Seq[Any](format.raw/*17.30*/("""
        <li><a href=""""),_display_(Seq[Any](/*18.23*/s3file/*18.29*/.getUrl())),format.raw/*18.38*/("""">"""),_display_(Seq[Any](/*18.41*/s3file/*18.47*/.getName())),format.raw/*18.57*/("""</a></li>
    """)))})),format.raw/*19.6*/("""
    </ul>
    """)))})),format.raw/*21.6*/("""
"""))}
    }
    
    def render(s3Files:List[models.S3File]): play.api.templates.HtmlFormat.Appendable = apply(s3Files)
    
    def f:((List[models.S3File]) => play.api.templates.HtmlFormat.Appendable) = (s3Files) => apply(s3Files)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 00:57:47 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/index.scala.html
                    HASH: 031d31fc1a4c1b342e31b5b2388f77ef2203c57a
                    MATRIX: 787->1|911->31|956->42|978->56|1017->58|1095->102|1109->108|1193->184|1232->186|1421->344|1498->386|1536->408|1576->410|1636->434|1651->440|1682->449|1721->452|1736->458|1768->468|1815->484|1864->502
                    LINES: 26->1|29->1|32->4|32->4|32->4|36->8|36->8|36->8|36->8|41->13|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|46->18|47->19|49->21
                    -- GENERATED --
                */
            