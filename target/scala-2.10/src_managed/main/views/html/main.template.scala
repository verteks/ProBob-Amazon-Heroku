
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>"""),_display_(Seq[Any](/*8.17*/title)),format.raw/*8.22*/("""</title>
            <!--[if lt IE 9]>
      	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    	<![endif]-->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/main.css"))),format.raw/*13.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*15.59*/routes/*15.65*/.Assets.at("images/favicon.png"))),format.raw/*15.97*/("""">
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*16.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("bootstrap/js/bootstrap.js"))),format.raw/*17.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/knockout.js"))),format.raw/*18.66*/("""" type="text/javascript"></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*19.46*/routes/*19.52*/.AmazonUpload.jsRoutes)),format.raw/*19.74*/(""""></script>

        <title>File Upload with Java, Play 2, and S3</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*22.59*/routes/*22.65*/.Assets.at("images/favicon.png"))),format.raw/*22.97*/("""">
    </head>
    <body>
            <div>
                """),_display_(Seq[Any](/*26.18*/if(Auth.currentUserEmail() == null)/*26.53*/ {_display_(Seq[Any](format.raw/*26.55*/("""
                    """),_display_(Seq[Any](/*27.22*/helper/*27.28*/.form(routes.Auth.login())/*27.54*/ {_display_(Seq[Any](format.raw/*27.56*/("""
                        <button type="submit" >Авторизация</button>
                    """)))})),format.raw/*29.22*/("""
                """)))})),format.raw/*30.18*/("""
                """),_display_(Seq[Any](/*31.18*/if(Auth.currentUserEmail() == null)/*31.53*/ {_display_(Seq[Any](format.raw/*31.55*/("""
                    """),_display_(Seq[Any](/*32.22*/helper/*32.28*/.form(routes.Auth.signup())/*32.55*/ {_display_(Seq[Any](format.raw/*32.57*/("""
                        <button type="submit" >Зарегистрироваться</button>
                    """)))})),format.raw/*34.22*/("""
                """)))})),format.raw/*35.18*/("""
                """),_display_(Seq[Any](/*36.18*/if(Auth.currentUserEmail() != null)/*36.53*/ {_display_(Seq[Any](format.raw/*36.55*/("""
                    <h2>"""),_display_(Seq[Any](/*37.26*/Auth/*37.30*/.currentUserEmail())),format.raw/*37.49*/("""</h2>
                    """),_display_(Seq[Any](/*38.22*/helper/*38.28*/.form(routes.Auth.logout())/*38.55*/ {_display_(Seq[Any](format.raw/*38.57*/("""
                        <button type="submit" >Выход</button>
                    """)))})),format.raw/*40.22*/("""
                """)))})),format.raw/*41.18*/("""
        </div>
        <div>
            """),_display_(Seq[Any](/*44.14*/content)),format.raw/*44.21*/("""
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 20 03:22:24 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/main.scala.html
                    HASH: 26f3e4cc2b44496aecaaf391b0223eb24c5e7682
                    MATRIX: 778->1|902->31|1165->259|1191->264|1512->549|1527->555|1583->589|1676->646|1691->652|1755->693|1853->755|1868->761|1922->793|1984->819|1999->825|2066->870|2160->928|2175->934|2236->973|2330->1031|2345->1037|2404->1074|2521->1155|2536->1161|2580->1183|2751->1318|2766->1324|2820->1356|2921->1421|2965->1456|3005->1458|3064->1481|3079->1487|3114->1513|3154->1515|3278->1607|3329->1626|3384->1645|3428->1680|3468->1682|3527->1705|3542->1711|3578->1738|3618->1740|3749->1839|3800->1858|3855->1877|3899->1912|3939->1914|4002->1941|4015->1945|4056->1964|4120->1992|4135->1998|4171->2025|4211->2027|4329->2113|4380->2132|4462->2178|4491->2185
                    LINES: 26->1|29->1|36->8|36->8|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|50->22|50->22|50->22|54->26|54->26|54->26|55->27|55->27|55->27|55->27|57->29|58->30|59->31|59->31|59->31|60->32|60->32|60->32|60->32|62->34|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|66->38|68->40|69->41|72->44|72->44
                    -- GENERATED --
                */
            