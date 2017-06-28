
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Login],Form[EasySearch],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[Login], easySearchForm: Form[EasySearch]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""
    """),_display_(Seq[Any](/*2.6*/main("Вход")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""
        """),_display_(Seq[Any](/*3.10*/if(loginForm.hasErrors)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
            <div class="alert alert-danger">
                <a class="close" data-dismiss="alert">x</a>
                """),_display_(Seq[Any](/*6.18*/if(loginForm.errors.size() > 0)/*6.49*/ {_display_(Seq[Any](format.raw/*6.51*/("""
                    """),_display_(Seq[Any](/*7.22*/for((key, value) <- loginForm.errors) yield /*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""
                        """),_display_(Seq[Any](/*8.26*/for(err <- value) yield /*8.43*/ {_display_(Seq[Any](format.raw/*8.45*/("""
                            <p>"""),_display_(Seq[Any](/*9.33*/err/*9.36*/.message().toString())),format.raw/*9.57*/("""</p>
                        """)))})),format.raw/*10.26*/("""
                    """)))})),format.raw/*11.22*/("""
                """)))})),format.raw/*12.18*/("""
            </div>
        """)))})),format.raw/*14.10*/("""
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Auth.auth())/*15.41*/ {_display_(Seq[Any](format.raw/*15.43*/("""
            <h2 class="form-signin-heading">Вход</h2>
            """),_display_(Seq[Any](/*17.14*/input(loginForm("email"), "Email", 'type -> "text"))),format.raw/*17.65*/("""
            """),_display_(Seq[Any](/*18.14*/input(loginForm("password"), "Пароль", 'type -> "password"))),format.raw/*18.73*/("""

            <div class="form-group">
                <button type="submit" class="btn btn-primary">Войти</button> или
                <a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Auth.logout())),format.raw/*22.47*/("""" class="btn btn-default">Зарегистрироваться</a>

            </div>
        """)))})),format.raw/*25.10*/("""
         """),_display_(Seq[Any](/*26.11*/helper/*26.17*/.form(routes.EasyAccess.search(), 'method -> "GET")/*26.68*/ {_display_(Seq[Any](format.raw/*26.70*/("""
            <h2 class="form-signin-heading">Easy Access</h2>
            <input type="text" name="easySearch">
            <button type="submit" class="btn btn-primary">Go Easy</button>

         """)))})),format.raw/*31.11*/("""
    """)))})),format.raw/*32.6*/("""
"""))}
    }
    
    def render(loginForm:Form[Login],easySearchForm:Form[EasySearch]): play.api.templates.HtmlFormat.Appendable = apply(loginForm,easySearchForm)
    
    def f:((Form[Login],Form[EasySearch]) => play.api.templates.HtmlFormat.Appendable) = (loginForm,easySearchForm) => apply(loginForm,easySearchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 28 22:23:23 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/login.scala.html
                    HASH: adc88e6a7f2f64295bac85c9f27e902090dfe6b0
                    MATRIX: 796->1|948->59|989->66|1009->78|1048->80|1094->91|1125->114|1164->116|1325->242|1364->273|1403->275|1461->298|1513->335|1552->337|1614->364|1646->381|1685->383|1754->417|1765->420|1807->441|1870->472|1925->495|1976->514|2039->545|2086->556|2101->562|2135->587|2175->589|2281->659|2354->710|2405->725|2486->784|2672->934|2687->940|2723->954|2836->1035|2884->1047|2899->1053|2959->1104|2999->1106|3234->1309|3272->1316
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|40->12|42->14|43->15|43->15|43->15|43->15|45->17|45->17|46->18|46->18|50->22|50->22|50->22|53->25|54->26|54->26|54->26|54->26|59->31|60->32
                    -- GENERATED --
                */
            