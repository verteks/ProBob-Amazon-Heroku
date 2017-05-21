
package views.html.upload

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[String,String,String,String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(s3Bucket: String,filename : String,accessKey : String,acl: String,success_action_redirect: String,policy: String,signature: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import bootstrap._


Seq[Any](format.raw/*1.134*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Uplode")/*4.16*/ {_display_(Seq[Any](format.raw/*4.18*/("""
    <div data-bind="uploadViewModel">
        <p>"""),_display_(Seq[Any](/*6.13*/s3Bucket)),format.raw/*6.21*/("""</p>
        <p>"""),_display_(Seq[Any](/*7.13*/filename)),format.raw/*7.21*/("""</p>
        <p>"""),_display_(Seq[Any](/*8.13*/accessKey)),format.raw/*8.22*/("""</p>
        <p>"""),_display_(Seq[Any](/*9.13*/acl)),format.raw/*9.16*/("""</p>
        <p>"""),_display_(Seq[Any](/*10.13*/success_action_redirect)),format.raw/*10.36*/("""</p>
        <p>"""),_display_(Seq[Any](/*11.13*/policy)),format.raw/*11.19*/("""</p>
        <p>"""),_display_(Seq[Any](/*12.13*/signature)),format.raw/*12.22*/("""</p>

            <form action=""""),_display_(Seq[Any](/*14.28*/s3Bucket)),format.raw/*14.36*/("""" method="post" enctype="multipart/form-data">
                <input type="hidden" name="key" value=""""),_display_(Seq[Any](/*15.57*/filename)),format.raw/*15.65*/("""">
                <input type="hidden" name="AWSAccessKeyId" value=""""),_display_(Seq[Any](/*16.68*/accessKey)),format.raw/*16.77*/("""">
                <input type="hidden" name="acl" value=""""),_display_(Seq[Any](/*17.57*/acl)),format.raw/*17.60*/("""">
                <input type="hidden" name="success_action_redirect" value=""""),_display_(Seq[Any](/*18.77*/success_action_redirect)),format.raw/*18.100*/("""">
                <input type="hidden" name="policy" value=""""),_display_(Seq[Any](/*19.60*/policy)),format.raw/*19.66*/("""">
                <input type="hidden" name="signature" value=""""),_display_(Seq[Any](/*20.63*/signature)),format.raw/*20.72*/("""">
                <input type="hidden" name="Content-Type" value="">
                    File to upload to S3:
                <input name="file" type="file">
                <br>
                <input type="submit" value="Upload File to S3">
            </form>
        <p data-bind="s3Bucket"></p>>
    </div>


    <!--<script language = "javascript" lang="javascript" src ='"""),_display_(Seq[Any](/*31.66*/routes/*31.72*/.Assets.at("javascripts/app.js"))),format.raw/*31.104*/("""'></script>-->

""")))})))}
    }
    
    def render(s3Bucket:String,filename:String,accessKey:String,acl:String,success_action_redirect:String,policy:String,signature:String): play.api.templates.HtmlFormat.Appendable = apply(s3Bucket,filename,accessKey,acl,success_action_redirect,policy,signature)
    
    def f:((String,String,String,String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (s3Bucket,filename,accessKey,acl,success_action_redirect,policy,signature) => apply(s3Bucket,filename,accessKey,acl,success_action_redirect,policy,signature)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 20 05:33:52 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/upload/index.scala.html
                    HASH: 0906b2c3e90889f70e17ba3f10a366e09d0c00e0
                    MATRIX: 823->1|1070->133|1098->156|1135->159|1157->173|1196->175|1284->228|1313->236|1366->254|1395->262|1448->280|1478->289|1531->307|1555->310|1609->328|1654->351|1708->369|1736->375|1790->393|1821->402|1892->437|1922->445|2062->549|2092->557|2199->628|2230->637|2326->697|2351->700|2467->780|2513->803|2612->866|2640->872|2742->938|2773->947|3201->1339|3216->1345|3271->1377
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|35->7|35->7|36->8|36->8|37->9|37->9|38->10|38->10|39->11|39->11|40->12|40->12|42->14|42->14|43->15|43->15|44->16|44->16|45->17|45->17|46->18|46->18|47->19|47->19|48->20|48->20|59->31|59->31|59->31
                    -- GENERATED --
                */
            