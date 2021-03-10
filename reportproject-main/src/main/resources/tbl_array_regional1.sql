
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `checkforplag`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_array_regional1`
--

DROP TABLE IF EXISTS `tbl_array_regional1`;
CREATE TABLE IF NOT EXISTS `tbl_array_regional1` (
  `sr_no` int(11) NOT NULL AUTO_INCREMENT,
  `upload_sr_no` int(11) NOT NULL,
  `no_of_array` int(11) NOT NULL,
  `array_index` varchar(1000) CHARACTER SET latin1 NOT NULL,
  `array` longtext COLLATE utf8_unicode_ci,
  `array_nu` longtext COLLATE utf8_unicode_ci,
  `b_tag` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `b_tag_per` float(10,2) DEFAULT '0.00',
  `url` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `para` varchar(10000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `b_tag1` longtext COLLATE utf8_unicode_ci,
  `b_tag_per1` float(10,2) DEFAULT '0.00',
  `url1` longtext COLLATE utf8_unicode_ci,
  `para1` longtext COLLATE utf8_unicode_ci,
  `b_tag2` longtext COLLATE utf8_unicode_ci,
  `b_tag_per2` float(10,2) DEFAULT '0.00',
  `url2` longtext COLLATE utf8_unicode_ci,
  `para2` longtext COLLATE utf8_unicode_ci,
  `b_tag_nu` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `b_tag_per_nu` float(10,2) DEFAULT '0.00',
  `url_nu` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `para_nu` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `b_tag_nu1` longtext COLLATE utf8_unicode_ci,
  `b_tag_per_nu1` float(10,2) NOT NULL DEFAULT '0.00',
  `url_nu1` longtext COLLATE utf8_unicode_ci,
  `para_nu1` longtext COLLATE utf8_unicode_ci,
  `b_tag_nu2` longtext COLLATE utf8_unicode_ci,
  `b_tag_per_nu2` float(10,2) NOT NULL DEFAULT '0.00',
  `url_nu2` longtext COLLATE utf8_unicode_ci,
  `para_nu2` longtext COLLATE utf8_unicode_ci,
  `btag14` longtext COLLATE utf8_unicode_ci,
  `btag14_per` float(10,2) DEFAULT '0.00',
  `url14` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `para14` longtext COLLATE utf8_unicode_ci,
  `btag14NU` longtext COLLATE utf8_unicode_ci,
  `btag14_perNU` float(10,2) DEFAULT '0.00',
  `url14NU` longtext COLLATE utf8_unicode_ci,
  `para14NU` longtext COLLATE utf8_unicode_ci,
  `url_exclude14` enum('1','0') COLLATE utf8_unicode_ci NOT NULL DEFAULT '0' COMMENT '0 = Not Excluded, 1 = Excluded',
  `b_tag_db` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `b_tag_per_db` float(10,2) DEFAULT '0.00',
  `file_path_db` varchar(1000) CHARACTER SET latin1 DEFAULT NULL,
  `fulltext_result` varchar(1000) CHARACTER SET latin1 DEFAULT NULL,
  `url_selected` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url_selected14` longtext COLLATE utf8_unicode_ci,
  `alternate` int(11) DEFAULT '0',
  `url_exclude` varchar(500) CHARACTER SET latin1 NOT NULL DEFAULT '0',
  `com_status` enum('0','1') CHARACTER SET latin1 NOT NULL DEFAULT '0' COMMENT '0 = pending, 1 = completed',
  `com_status_nu` enum('0','1') CHARACTER SET latin1 NOT NULL DEFAULT '0' COMMENT '0 = pending, 1 = completed',
  `uni_status` enum('0','1') CHARACTER SET latin1 NOT NULL DEFAULT '0' COMMENT '0 = pending, 1 = completed',
  `db_status` enum('1','0') COLLATE utf8_unicode_ci DEFAULT '0' COMMENT '	0 = Pending, 1 = Completed',
  PRIMARY KEY (`sr_no`)
) ENGINE=InnoDB AUTO_INCREMENT=39821 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbl_array_regional1`
--

INSERT INTO `tbl_array_regional1` (`sr_no`, `upload_sr_no`, `no_of_array`, `array_index`, `array`, `array_nu`, `b_tag`, `b_tag_per`, `url`, `para`, `b_tag1`, `b_tag_per1`, `url1`, `para1`, `b_tag2`, `b_tag_per2`, `url2`, `para2`, `b_tag_nu`, `b_tag_per_nu`, `url_nu`, `para_nu`, `b_tag_nu1`, `b_tag_per_nu1`, `url_nu1`, `para_nu1`, `b_tag_nu2`, `b_tag_per_nu2`, `url_nu2`, `para_nu2`, `btag14`, `btag14_per`, `url14`, `para14`, `btag14NU`, `btag14_perNU`, `url14NU`, `para14NU`, `url_exclude14`, `b_tag_db`, `b_tag_per_db`, `file_path_db`, `fulltext_result`, `url_selected`, `url_selected14`, `alternate`, `url_exclude`, `com_status`, `com_status_nu`, `uni_status`, `db_status`) VALUES
(38094, 12237, 119, '0', 'नवमाध्यम एवं सामाजिक विकास विकास एक सार्वभौम तथ्य है।  यह सार्वभौम इसलिए है क्योंकि यह एक विश्वव्यापी तत्व है, ', ' uoek/;e ,oa lkekftd fodkl fodkl ,d lkoZHkkSe rF; gSA  ;g lkoZHkkSe blfy, gS D;ksafd ;g ,d fo”oO;kih rRo gS] ', 'विकास विकास एक सार्वभौम तथ्य है। यह सार्वभौम इसलिए है क्योंकि यह एक विश्वव्यापी तत्व है,', 80.00, 'http://newmedialogy.blogspot.com/2018/07/blog-post_23.html', '8 जुलाई 2018 <b>...</b> <b>विकास एक सार्वभौम तथ्य</b> है। <b>यह सार्वभौम</b> <br>\n<b>इसलिए है क्योंकि यह एक विश्वव्यापी तत्व</b> <br>\n<b>है</b>, जिसकी अनेक व्याख्याएं की जाती हैं तथा <br>\nइसे विविध प्रकारों से समझा जाता है। कोई&nbsp;...', NULL, 0.00, NULL, NULL, NULL, 0.00, NULL, NULL, 'fodkl fodkl d gSA g blfy, gS D;ksafd g d fo”oO;kih gS]', 57.14, 'https://shodhganga.inflibnet.ac.in/jspui/bitstream/10603/224236/5/05_chapter1.pdf', '¼&#39;kfDr½ ds mriknd lzksr ds :i esa ns[ krs <b>gSa D</b>;<b>ksafd</b> ;<b>g</b> vU;ksa ds lkFk gekjs <br>\nfopkjksa] ... sl k gh xBtksM + vax zst h lkezk T;okn ls dj j[kk FkkA <b>blfy</b>, lu mUuhl lkS. <br>\nlSar kyhl esa ... rduhdksa dk vHkwr iwo Z <b>fodkl</b> gqv kA ;fn f}rh; <b>fo</b>&#39;o ;q) us mRikn {<br>\nkerk vkSj ckt+k j ... fd;k tk, <b>D</b>;<b>ksafd</b> Økafr dk lEca/k ftlls lcls T;knk <b>gS</b> og <b>e/;</b> oxZ gh <br>\n<b>gSA</b>.', NULL, 0.00, NULL, NULL, NULL, 0.00, NULL, NULL, ' विकास विकास एक सार्वभौम तथ्य है। यह सार्वभौम इसलिए है क्योंकि यह एक विश्वव्यापी तत्व है,', 84.21, 'http://newmedialogy.blogspot.com/2018/07/blog-post_23.html', NULL, NULL, 0.00, NULL, NULL, '0', NULL, 0.00, NULL, NULL, 'http://newmedialogy.blogspot.com/2018/07/blog-post_23.html', NULL, 0, '0', '1', '1', '1', '0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_array_regional1`
--
ALTER TABLE `tbl_array_regional1` ADD FULLTEXT KEY `array` (`array`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

