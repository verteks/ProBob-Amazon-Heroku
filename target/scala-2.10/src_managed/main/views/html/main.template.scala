
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

        <title>File Upload with Java, Play 2, and S3</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*21.59*/routes/*21.65*/.Assets.at("images/favicon.png"))),format.raw/*21.97*/("""">
    </head>
    <body>
            <div>
                """),_display_(Seq[Any](/*25.18*/if(Auth.currentUserEmail() == null)/*25.53*/ {_display_(Seq[Any](format.raw/*25.55*/("""
                    """),_display_(Seq[Any](/*26.22*/helper/*26.28*/.form(routes.Auth.login())/*26.54*/ {_display_(Seq[Any](format.raw/*26.56*/("""
                        <button type="submit" >Авторизация</button>
                    """)))})),format.raw/*28.22*/("""
                """)))})),format.raw/*29.18*/("""
                """),_display_(Seq[Any](/*30.18*/if(Auth.currentUserEmail() == null)/*30.53*/ {_display_(Seq[Any](format.raw/*30.55*/("""
                    """),_display_(Seq[Any](/*31.22*/helper/*31.28*/.form(routes.Auth.signup())/*31.55*/ {_display_(Seq[Any](format.raw/*31.57*/("""
                        <button type="submit" >Зарегистрироваться</button>
                    """)))})),format.raw/*33.22*/("""
                """)))})),format.raw/*34.18*/("""
                """),_display_(Seq[Any](/*35.18*/if(Auth.currentUserEmail() != null)/*35.53*/ {_display_(Seq[Any](format.raw/*35.55*/("""
                    <h2>"""),_display_(Seq[Any](/*36.26*/Auth/*36.30*/.currentUserEmail())),format.raw/*36.49*/("""</h2>
                    """),_display_(Seq[Any](/*37.22*/helper/*37.28*/.form(routes.Auth.logout())/*37.55*/ {_display_(Seq[Any](format.raw/*37.57*/("""
                        <button type="submit" >Выход</button>
                    """)))})),format.raw/*39.22*/("""
                """)))})),format.raw/*40.18*/("""
        </div>
        <div>
            """),_display_(Seq[Any](/*43.14*/content)),format.raw/*43.21*/("""
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
                    DATE: Fri May 19 01:01:31 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/aamazon-heroku/app/views/main.scala.html
                    HASH: 77ab36f0eaa880ea1ab5d0437bbeb1ff33e19286
                    MATRIX: 778->1|902->31|1165->259|1191->264|1512->549|1527->555|1583->589|1676->646|1691->652|1755->693|1853->755|1868->761|1922->793|1984->819|1999->825|2066->870|2160->928|2175->934|2236->973|2330->1031|2345->1037|2404->1074|2598->1232|2613->1238|2667->1270|2768->1335|2812->1370|2852->1372|2911->1395|2926->1401|2961->1427|3001->1429|3125->1521|3176->1540|3231->1559|3275->1594|3315->1596|3374->1619|3389->1625|3425->1652|3465->1654|3596->1753|3647->1772|3702->1791|3746->1826|3786->1828|3849->1855|3862->1859|3903->1878|3967->1906|3982->1912|4018->1939|4058->1941|4176->2027|4227->2046|4309->2092|4338->2099
                    LINES: 26->1|29->1|36->8|36->8|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21|49->21|53->25|53->25|53->25|54->26|54->26|54->26|54->26|56->28|57->29|58->30|58->30|58->30|59->31|59->31|59->31|59->31|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|65->37|67->39|68->40|71->43|71->43
                    -- GENERATED --
                */
            