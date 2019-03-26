package domain;

import java.util.List;

public class Video {
	private String title;
	private String url;
	private List<String> tags;

	public Video(String title, String url, List<String> tags)
		{
			super();
			this.title = title;
			this.url = url;
			this.tags = tags;
		}

	public String getTitle()
		{
			return title;
		}

	public void setTitle(String title)
		{
			this.title = title;
		}

	public String getUrl()
		{
			return url;
		}

	public void setUrl(String url)
		{
			this.url = url;
		}

	public List<String> getTags()
		{
			return tags;
		}

	public static void checkText(List<String> tags) throws Exception
		{
			for (int i = 0; i < tags.size(); i++)
				{
					String tag = tags.get(i);
					if (tag.isEmpty() || tag.contains(" "))
						throw new Exception("--TAG ERROR--");
				}
		}

	@Override
	public String toString()
		{
			return "Video [title=" + title + ", url=" + url + ", tags=" + tags + "]";
		}

}
