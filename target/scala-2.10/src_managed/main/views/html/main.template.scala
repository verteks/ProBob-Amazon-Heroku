
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
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*23.59*/routes/*23.65*/.Assets.at("images/favicon.png"))),format.raw/*23.97*/("""">
    </head>
    <body>
            <div>
                """),_display_(Seq[Any](/*27.18*/if(Auth.currentUserEmail() == null)/*27.53*/ {_display_(Seq[Any](format.raw/*27.55*/("""
                    """),_display_(Seq[Any](/*28.22*/helper/*28.28*/.form(routes.Auth.login())/*28.54*/ {_display_(Seq[Any](format.raw/*28.56*/("""
                        <button type="submit" >Авторизация</button>
                    """)))})),format.raw/*30.22*/("""
                """)))})),format.raw/*31.18*/("""
                """),_display_(Seq[Any](/*32.18*/if(Auth.currentUserEmail() == null)/*32.53*/ {_display_(Seq[Any](format.raw/*32.55*/("""
                    """),_display_(Seq[Any](/*33.22*/helper/*33.28*/.form(routes.Auth.signup())/*33.55*/ {_display_(Seq[Any](format.raw/*33.57*/("""
                        <button type="submit" >Зарегистрироваться</button>
                    """)))})),format.raw/*35.22*/("""
                """)))})),format.raw/*36.18*/("""
                """),_display_(Seq[Any](/*37.18*/if(Auth.currentUserEmail() != null)/*37.53*/ {_display_(Seq[Any](format.raw/*37.55*/("""
                    <h2>"""),_display_(Seq[Any](/*38.26*/Auth/*38.30*/.currentUserEmail())),format.raw/*38.49*/("""</h2>
                    """),_display_(Seq[Any](/*39.22*/helper/*39.28*/.form(routes.Auth.logout())/*39.55*/ {_display_(Seq[Any](format.raw/*39.57*/("""
                        <button type="submit" >Выход</button>
                    """)))})),format.raw/*41.22*/("""
                """)))})),format.raw/*42.18*/("""
        </div>
        <div>
            """),_display_(Seq[Any](/*45.14*/content)),format.raw/*45.21*/("""
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
                    DATE: Fri May 26 11:32:19 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/main.scala.html
                    HASH: 0d656ebcb2fda7f85e3508a8c34f27b15a09c0b3
                    MATRIX: 778->1|902->31|1244->338|1270->343|1591->628|1606->634|1662->668|1755->725|1770->731|1834->772|1932->834|1947->840|2001->872|2063->898|2078->904|2145->949|2239->1007|2254->1013|2315->1052|2409->1110|2424->1116|2483->1153|2600->1234|2615->1240|2659->1262|2830->1397|2845->1403|2899->1435|3000->1500|3044->1535|3084->1537|3143->1560|3158->1566|3193->1592|3233->1594|3357->1686|3408->1705|3463->1724|3507->1759|3547->1761|3606->1784|3621->1790|3657->1817|3697->1819|3828->1918|3879->1937|3934->1956|3978->1991|4018->1993|4081->2020|4094->2024|4135->2043|4199->2071|4214->2077|4250->2104|4290->2106|4408->2192|4459->2211|4541->2257|4570->2264
                    LINES: 26->1|29->1|37->9|37->9|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|51->23|51->23|51->23|55->27|55->27|55->27|56->28|56->28|56->28|56->28|58->30|59->31|60->32|60->32|60->32|61->33|61->33|61->33|61->33|63->35|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|67->39|69->41|70->42|73->45|73->45
                    -- GENERATED --
                */
            