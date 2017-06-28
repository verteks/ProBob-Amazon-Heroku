
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
        <link rel="shortcut icon" type="image/x-icon" href=""""),_display_(Seq[Any](/*17.62*/routes/*17.68*/.Assets.at("images/favicon.ico"))),format.raw/*17.100*/("""">
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
                        <a href=""""),_display_(Seq[Any](/*48.35*/routes/*48.41*/.Application.index())),format.raw/*48.61*/("""">
                        <div class="PersikDiv">

                        </div>
                        </a>
                    <h2>"""),_display_(Seq[Any](/*53.26*/Auth/*53.30*/.currentUserEmail())),format.raw/*53.49*/("""</h2>
                    <div class="UserLogIn1 col-md-1" >
                    """),_display_(Seq[Any](/*55.22*/helper/*55.28*/.form(routes.Auth.logout())/*55.55*/ {_display_(Seq[Any](format.raw/*55.57*/("""
                        <button type="submit" class="btn btn-primary">Выход</button>
                    """)))})),format.raw/*57.22*/("""
                    </div>
                    <div class="UserLogIn2 col-md-2" >
                    """),_display_(Seq[Any](/*60.22*/helper/*60.28*/.form(routes.Admin.profile())/*60.57*/ {_display_(Seq[Any](format.raw/*60.59*/("""
                            <button type="submit" class="btn btn-primary">Настройки</button>
                    """)))})),format.raw/*62.22*/("""
                    </div>
                    </div>

                """)))})),format.raw/*66.18*/("""

        <div>
            """),_display_(Seq[Any](/*69.14*/content)),format.raw/*69.21*/("""
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
                    DATE: Thu Jun 29 00:03:40 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/main.scala.html
                    HASH: 8e38c805bc52a041abdd09db238606c7e28e10b9
                    MATRIX: 778->1|902->31|1244->338|1270->343|1591->628|1606->634|1662->668|1755->725|1770->731|1834->772|1927->829|1942->835|2000->871|2101->936|2116->942|2171->974|2233->1000|2248->1006|2315->1051|2409->1109|2424->1115|2485->1154|2579->1212|2594->1218|2653->1255|2770->1336|2785->1342|2828->1363|3020->1519|3064->1554|3104->1556|3278->1694|3293->1700|3328->1726|3368->1728|3531->1859|3682->1974|3697->1980|3733->2007|3773->2009|3943->2147|4056->2228|4111->2247|4155->2282|4195->2284|4314->2367|4329->2373|4371->2393|4549->2535|4562->2539|4603->2558|4723->2642|4738->2648|4774->2675|4814->2677|4955->2786|5098->2893|5113->2899|5151->2928|5191->2930|5340->3047|5449->3124|5517->3156|5546->3163
                    LINES: 26->1|29->1|37->9|37->9|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|57->29|57->29|57->29|60->32|60->32|60->32|60->32|62->34|65->37|65->37|65->37|65->37|67->39|71->43|72->44|72->44|72->44|76->48|76->48|76->48|81->53|81->53|81->53|83->55|83->55|83->55|83->55|85->57|88->60|88->60|88->60|88->60|90->62|94->66|97->69|97->69
                    -- GENERATED --
                */
            