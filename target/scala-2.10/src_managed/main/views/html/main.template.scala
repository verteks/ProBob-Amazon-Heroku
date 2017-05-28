
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>"""),_display_(Seq[Any](/*9.17*/title)),format.raw/*9.22*/("""</title>
            <!--[if lt IE 9]>
      	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    	<![endif]-->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css"))),format.raw/*14.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.54*/routes/*15.60*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*15.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*16.59*/routes/*16.65*/.Assets.at("images/favicon.png"))),format.raw/*16.97*/("""">
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*17.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("bootstrap/js/bootstrap.js"))),format.raw/*18.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("javascripts/knockout.js"))),format.raw/*19.66*/("""" type="text/javascript"></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*20.46*/routes/*20.52*/.AmazonUpload.jsRoutes)),format.raw/*20.74*/(""""></script>

        <title>File Upload with Java, Play 2, and S3</title>
    </head>
    <body>
            <div>
                """),_display_(Seq[Any](/*26.18*/if(Auth.currentUserEmail() == null)/*26.53*/ {_display_(Seq[Any](format.raw/*26.55*/("""
                    """),_display_(Seq[Any](/*27.22*/helper/*27.28*/.form(routes.Auth.login())/*27.54*/ {_display_(Seq[Any](format.raw/*27.56*/("""
                        <button type="submit" >Авторизация</button>
                    """)))})),format.raw/*29.22*/("""
                    """),_display_(Seq[Any](/*30.22*/helper/*30.28*/.form(routes.Auth.signup())/*30.55*/ {_display_(Seq[Any](format.raw/*30.57*/("""
                        <button type="submit" >Зарегистрироваться</button>
                    """)))})),format.raw/*32.22*/("""
                """)))})),format.raw/*33.18*/("""
                """),_display_(Seq[Any](/*34.18*/if(Auth.currentUserEmail() != null)/*34.53*/ {_display_(Seq[Any](format.raw/*34.55*/("""
                    <h2>"""),_display_(Seq[Any](/*35.26*/Auth/*35.30*/.currentUserEmail())),format.raw/*35.49*/("""</h2>
                    """),_display_(Seq[Any](/*36.22*/helper/*36.28*/.form(routes.Auth.logout())/*36.55*/ {_display_(Seq[Any](format.raw/*36.57*/("""
                        <button type="submit" >Выход</button>
                    """)))})),format.raw/*38.22*/("""
                """)))})),format.raw/*39.18*/("""
        </div>
        <div>
            """),_display_(Seq[Any](/*42.14*/content)),format.raw/*42.21*/("""
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
                    DATE: Sat May 27 21:08:45 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/main.scala.html
                    HASH: d1233b7554cadc43047d51f2ca885d38622ea51b
                    MATRIX: 778->1|902->31|1244->338|1270->343|1591->628|1606->634|1662->668|1755->725|1770->731|1834->772|1932->834|1947->840|2001->872|2063->898|2078->904|2145->949|2239->1007|2254->1013|2315->1052|2409->1110|2424->1116|2483->1153|2600->1234|2615->1240|2659->1262|2833->1400|2877->1435|2917->1437|2976->1460|2991->1466|3026->1492|3066->1494|3190->1586|3249->1609|3264->1615|3300->1642|3340->1644|3471->1743|3522->1762|3577->1781|3621->1816|3661->1818|3724->1845|3737->1849|3778->1868|3842->1896|3857->1902|3893->1929|3933->1931|4051->2017|4102->2036|4184->2082|4213->2089
                    LINES: 26->1|29->1|37->9|37->9|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|54->26|54->26|54->26|55->27|55->27|55->27|55->27|57->29|58->30|58->30|58->30|58->30|60->32|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|64->36|66->38|67->39|70->42|70->42
                    -- GENERATED --
                */
            