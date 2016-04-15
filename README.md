# EpubParser

Epublib is a java library for parsing epub files.

EpubParser lets you read the epub content page by page. It aims to reduce memory consumption. It is useful for large epub files.

# Usage
Usage is fairly simple. Just instantiate a reader object, input the epub file path, set the optional values and start parsing the file by <i>readSection</i> method.

Example usage:

	Reader reader = new Reader();
	reader.setMaxContentPerSection(1000); // Max string length for the current page.
	reader.setFullContent(epubFilePath); // Setting content once is enough.
	reader.setIsIncludingTextContent(true); // Optional, to return the tags-excluded version.

	Book bookSection = reader.readSection(pageIndex);
	String sectionContent = bookSection.getSectionContent(); // Returns content as html.
	String sectionTextContent = bookSection.getSectionTextContent(); // Excludes html tags.

# License
See the <a href="https://github.com/mertakdut/EpubParser/blob/master/LICENSE.txt">LICENSE</a> file for license rights and limitations (Apache License 2.0).