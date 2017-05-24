
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
object input extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Field,String,Array[scala.Tuple2[Symbol, Any]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(field: Field, label: String, args: (Symbol,Any)*):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""
<div class=""""),_display_(Seq[Any](/*2.14*/if(field.hasErrors )/*2.34*/ {_display_(Seq[Any](format.raw/*2.36*/(""" has-error""")))})),format.raw/*2.47*/("""">
	<label for=""""),_display_(Seq[Any](/*3.15*/field/*3.20*/.name)),format.raw/*3.25*/("""" >"""),_display_(Seq[Any](/*3.29*/label)),format.raw/*3.34*/("""</label>
	<input name=""""),_display_(Seq[Any](/*4.16*/field/*4.21*/.name)),format.raw/*4.26*/("""" id=""""),_display_(Seq[Any](/*4.33*/field/*4.38*/.name)),format.raw/*4.43*/(""""  value=""""),_display_(Seq[Any](/*4.54*/field/*4.59*/.value)),format.raw/*4.65*/("""" """),_display_(Seq[Any](/*4.68*/toHtmlArgs(args.toMap))),format.raw/*4.90*/(""" />
	"""),_display_(Seq[Any](/*5.3*/if(field.hasErrors )/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
	<span class="help-block">
		"""),_display_(Seq[Any](/*7.4*/field/*7.9*/.errors.head.message)),format.raw/*7.29*/("""
	</span>
	""")))})),format.raw/*9.3*/("""
</div>
"""))}
    }
    
    def render(field:Field,label:String,args:Array[scala.Tuple2[Symbol, Any]]): play.api.templates.HtmlFormat.Appendable = apply(field,label,args:_*)
    
    def f:((Field,String,Array[scala.Tuple2[Symbol, Any]]) => play.api.templates.HtmlFormat.Appendable) = (field,label,args) => apply(field,label,args:_*)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 00:57:47 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/input.scala.html
                    HASH: 83b18dd4693d3cb0760f96259718cb746234dde6
                    MATRIX: 813->1|957->51|1007->66|1035->86|1074->88|1116->99|1169->117|1182->122|1208->127|1247->131|1273->136|1333->161|1346->166|1372->171|1414->178|1427->183|1453->188|1499->199|1512->204|1539->210|1577->213|1620->235|1661->242|1689->262|1728->264|1795->297|1807->302|1848->322|1892->336
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|37->9
                    -- GENERATED --
                */
            