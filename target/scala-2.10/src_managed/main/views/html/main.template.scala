
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
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.54*/routes/*16.60*/.Assets.at("bootstrap/css/main.css"))),format.raw/*16.96*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*17.59*/routes/*17.65*/.Assets.at("images/favicon.png"))),format.raw/*17.97*/("""">
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*18.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("bootstrap/js/bootstrap.js"))),format.raw/*19.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("javascripts/knockout.js"))),format.raw/*20.66*/("""" type="text/javascript"></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*21.46*/routes/*21.52*/.Application.jsRoutes)),format.raw/*21.73*/(""""></script>

        <title>File Upload with Java, Play 2, and S3</title>
    </head>
    <body>

        <div class="container">

                """),_display_(Seq[Any](/*29.18*/if(Auth.currentUserEmail() == null)/*29.53*/ {_display_(Seq[Any](format.raw/*29.55*/("""
                    <div class="UserUnLog">
                        <div class="UserUnLogIn1 col-md-2" >
                            """),_display_(Seq[Any](/*32.30*/helper/*32.36*/.form(routes.Auth.login())/*32.62*/ {_display_(Seq[Any](format.raw/*32.64*/("""
                                <button type="submit" class="btn btn-primary">Авторизация</button>
                            """)))})),format.raw/*34.30*/("""
                        </div>
                        <div class="UserUnLogIn2">
                            """),_display_(Seq[Any](/*37.30*/helper/*37.36*/.form(routes.Auth.signup())/*37.63*/ {_display_(Seq[Any](format.raw/*37.65*/("""
                                <button type="submit" class="btn btn-default">Зарегистрироваться</button>
                            """)))})),format.raw/*39.30*/("""
                        </div>
                    </div>

                """)))})),format.raw/*43.18*/("""
                """),_display_(Seq[Any](/*44.18*/if(Auth.currentUserEmail() != null)/*44.53*/ {_display_(Seq[Any](format.raw/*44.55*/("""
                    <div class="UserLog">
                        <div class="PersikDiv">
                        </div>
                    <h2>"""),_display_(Seq[Any](/*48.26*/Auth/*48.30*/.currentUserEmail())),format.raw/*48.49*/("""</h2>
                    """),_display_(Seq[Any](/*49.22*/helper/*49.28*/.form(routes.Auth.logout())/*49.55*/ {_display_(Seq[Any](format.raw/*49.57*/("""
                        <button type="submit" class="btn btn-primary">Выход</button>
                    """)))})),format.raw/*51.22*/("""
                    </div>
                """)))})),format.raw/*53.18*/("""

        <div>
            """),_display_(Seq[Any](/*56.14*/content)),format.raw/*56.21*/("""
        </div>
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
                    DATE: Mon Jun 26 22:40:59 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/main.scala.html
                    HASH: 188cefd5eaed901608c0cd4492847bc5a2f042dc
                    MATRIX: 778->1|902->31|1244->338|1270->343|1591->628|1606->634|1662->668|1755->725|1770->731|1834->772|1927->829|1942->835|2000->871|2098->933|2113->939|2167->971|2229->997|2244->1003|2311->1048|2405->1106|2420->1112|2481->1151|2575->1209|2590->1215|2649->1252|2766->1333|2781->1339|2824->1360|3016->1516|3060->1551|3100->1553|3274->1691|3289->1697|3324->1723|3364->1725|3527->1856|3678->1971|3693->1977|3729->2004|3769->2006|3939->2144|4052->2225|4107->2244|4151->2279|4191->2281|4378->2432|4391->2436|4432->2455|4496->2483|4511->2489|4547->2516|4587->2518|4728->2627|4807->2674|4875->2706|4904->2713
                    LINES: 26->1|29->1|37->9|37->9|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|57->29|57->29|57->29|60->32|60->32|60->32|60->32|62->34|65->37|65->37|65->37|65->37|67->39|71->43|72->44|72->44|72->44|76->48|76->48|76->48|77->49|77->49|77->49|77->49|79->51|81->53|84->56|84->56
                    -- GENERATED --
                */
            