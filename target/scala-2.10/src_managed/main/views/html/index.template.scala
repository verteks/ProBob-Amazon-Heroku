
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


    """),_display_(Seq[Any](/*4.6*/main("Регистрация")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""

    <h1>Upload a file:</h1>
    
    """),_display_(Seq[Any](/*8.6*/helper/*8.12*/.form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*8.88*/ {_display_(Seq[Any](format.raw/*8.90*/("""
        <input type="file" name="upload">
        <input type="submit">
    """)))})),format.raw/*11.6*/("""

    <h1>Uploads:</h1>
    <ul>
    """),_display_(Seq[Any](/*15.6*/for(s3file <- s3Files) yield /*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""
        <li><a href=""""),_display_(Seq[Any](/*16.23*/s3file/*16.29*/.getUrl())),format.raw/*16.38*/("""">"""),_display_(Seq[Any](/*16.41*/s3file/*16.47*/.getName())),format.raw/*16.57*/("""</a></li>
    """)))})),format.raw/*17.6*/("""
    </ul>
    """)))})),format.raw/*19.6*/("""
"""))}
    }
    
    def render(s3Files:List[models.S3File]): play.api.templates.HtmlFormat.Appendable = apply(s3Files)
    
    def f:((List[models.S3File]) => play.api.templates.HtmlFormat.Appendable) = (s3Files) => apply(s3Files)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 19 11:09:17 IRKT 2017
                    SOURCE: C:/playHero/play-2.2.6/play-2.2.6/ProBob-Amazon-Heroku/app/views/index.scala.html
                    HASH: 02df4ec420ec83b8f746eea2680459a28cfab1af
                    MATRIX: 787->1|911->31|956->42|983->61|1022->63|1100->107|1114->113|1198->189|1237->191|1349->272|1426->314|1464->336|1504->338|1564->362|1579->368|1610->377|1649->380|1664->386|1696->396|1743->412|1792->430
                    LINES: 26->1|29->1|32->4|32->4|32->4|36->8|36->8|36->8|36->8|39->11|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|45->17|47->19
                    -- GENERATED --
                */
            