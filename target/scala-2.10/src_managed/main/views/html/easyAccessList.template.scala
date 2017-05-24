
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


    """),_display_(Seq[Any](/*4.6*/main("Easy Access")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""

    <h1>Upload a file:</h1>
    <h1>Uploads:</h1>
    <ul>
    """),_display_(Seq[Any](/*9.6*/for(s3file <- s3Files) yield /*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
        <li><a href=""""),_display_(Seq[Any](/*10.23*/s3file/*10.29*/.getUrl())),format.raw/*10.38*/("""">"""),_display_(Seq[Any](/*10.41*/s3file/*10.47*/.getName())),format.raw/*10.57*/("""</a></li>
    """)))})),format.raw/*11.6*/("""
    </ul>
    """)))})),format.raw/*13.6*/("""
"""))}
    }
    
    def render(s3Files:List[models.S3File]): play.api.templates.HtmlFormat.Appendable = apply(s3Files)
    
    def f:((List[models.S3File]) => play.api.templates.HtmlFormat.Appendable) = (s3Files) => apply(s3Files)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 01:59:49 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/easyAccessList.scala.html
                    HASH: 3ee01bce72f0e8ac0930e445e0341634b478c03f
                    MATRIX: 796->1|920->31|965->42|992->61|1031->63|1136->134|1173->156|1212->158|1272->182|1287->188|1318->197|1357->200|1372->206|1404->216|1451->232|1500->250
                    LINES: 26->1|29->1|32->4|32->4|32->4|37->9|37->9|37->9|38->10|38->10|38->10|38->10|38->10|38->10|39->11|41->13
                    -- GENERATED --
                */
            