
package views.html.upload.bootstrap

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
object text extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[Field,String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(field: Field, label:String, placeholder:String, help:String, dataBind: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.81*/("""

<div class="form-group """),_display_(Seq[Any](/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""error""")))})),format.raw/*3.52*/("""">
  <label class="control-label" for=""""),_display_(Seq[Any](/*4.38*/field/*4.43*/.id)),format.raw/*4.46*/("""">"""),_display_(Seq[Any](/*4.49*/label)),format.raw/*4.54*/("""</label>
    <input
      class="form-control"
      type="text"
      id=""""),_display_(Seq[Any](/*8.12*/field/*8.17*/.id)),format.raw/*8.20*/(""""
      name=""""),_display_(Seq[Any](/*9.14*/field/*9.19*/.name)),format.raw/*9.24*/(""""
      data-bind=""""),_display_(Seq[Any](/*10.19*/dataBind)),format.raw/*10.27*/(""""
      value=""""),_display_(Seq[Any](/*11.15*/field/*11.20*/.value.getOrElse(""))),format.raw/*11.40*/(""""
      placeholder=""""),_display_(Seq[Any](/*12.21*/placeholder)),format.raw/*12.32*/("""" />

    <p class="help-block">"""),_display_(Seq[Any](/*14.28*/help)),format.raw/*14.32*/("""</p>
    <p class="help-block">"""),_display_(Seq[Any](/*15.28*/{field.error.map { error => error.message }})),format.raw/*15.72*/("""</p>
</div>
"""))}
    }
    
    def render(field:Field,label:String,placeholder:String,help:String,dataBind:String): play.api.templates.HtmlFormat.Appendable = apply(field,label,placeholder,help,dataBind)
    
    def f:((Field,String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (field,label,placeholder,help,dataBind) => apply(field,label,placeholder,help,dataBind)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 11:32:19 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/upload/bootstrap/text.scala.html
                    HASH: 982583a91150dfe2ce54f9ad4133660e0d3b0ce6
                    MATRIX: 817->1|990->80|1053->108|1080->127|1119->129|1156->135|1232->176|1245->181|1269->184|1307->187|1333->192|1448->272|1461->277|1485->280|1536->296|1549->301|1575->306|1632->327|1662->335|1715->352|1729->357|1771->377|1830->400|1863->411|1934->446|1960->450|2029->483|2095->527
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|39->11|39->11|39->11|40->12|40->12|42->14|42->14|43->15|43->15
                    -- GENERATED --
                */
            