//package com.example.user.challenge_viewlift
//
//
//import org.simpleframework.xml.*
//import javax.xml.bind.annotation.XmlAttribute
//import javax.xml.bind.annotation.XmlElement
//import javax.xml.bind.annotation.XmlElements
//import javax.xml.bind.annotation.XmlRootElement
//
//@XmlRootElement
//class Rss (
//    @XmlElement
//    var channel: Channel? = null
//)
//
//@XmlRootElement
//class Channel {
//    @XmlElement
//    var title: String? = null
//
////    @set:Element(name = "link", required = false)
////    @get:Element (name = "link", required = false)
////    var link: String? = null
//
//    @XmlElement
//    var language: String? = null
//
//    @XmlElement
//    var pubDate: String? = null
//
//    @XmlElement
//    var lastBuildDate: String? = null
//
//    @XmlElement
//    var description: String? = null
//
//    @XmlElement
//    var image: Image? = null
//
//    @XmlElement
//    var items: List<Item>? = null
//}
//
//@XmlRootElement
//class Image {
//
//    @XmlElement
//    var link: String? = null
//
//    @XmlElement
//    var title: String? = null
//
//    @XmlElement
//    var url: String? = null
//
//    @XmlElement
//    var description: String? = null
//
//    @XmlElement
//    var height: Int? = null
//
//
//}
//
//@XmlRootElement
//class Item {
//
//    @XmlElement
//    var title: String? = null
//
//    @XmlElement
//    var pubDate: String? = null
//
//    @XmlElement
//    var link: String? = null
//
//    @XmlElement
//    var description: String? = null
//
//    @XmlElement
//    var guid: String? = null
//
//    @XmlElements
//    var category: List<String>? = null
//
//    @XmlElement(namespace = "http://search.yahoo.com/mrss/")
//    var content: Content? = null
//
//}
//
//@XmlRootElement
//@Namespace(reference = "http://search.yahoo.com/mrss/", prefix = "media")
//class Content{
//
//    @XmlAttribute
//    var url: String? = null
//
//    @XmlAttribute
//    var language: String? = null
//
//    @XmlAttribute
//    var duration: String? = null
//
//    @XmlElement
//    var title: String? = null
//
//    @XmlElement
//    var description: String? = null
//
//    @XmlElement
//    var thumbnail: String? = null
//
//}
//
