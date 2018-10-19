package fintech.lesson05.examples

import java.util.Date

object Example13ClassTypeAlias extends App {

  def logs1(from: Date, to: Date): Seq[(String, Date, List[(String, String)], String)] = ???


  type NamedParameter = (String, String)
//  type NamedParameter = Tuple2[String, String]

  type LogRow = (String, Date, List[NamedParameter], String)

  def logs2(from: Date, to: Date): Seq[LogRow] = ???
}
