package asia.wavelet.parkson.dto.common.page;

import java.util.ArrayList;
import java.util.List;

import asia.wavelet.parkson.dto.common.Dto;

public class Pagination<X extends Dto> {
	private final List<X> content = new ArrayList<X>();
    
	public final int	DEFAULT_PAGESIZE	= 3;	// 每页记录数

	public final int	DEFAULT_PAGE		= 1;	// 默认显示第几页

	// =========================================================================================

	protected int		count;						// 总的记录数

	protected int		pageSize;					// 每页记录数

	protected int		pageCount;					// 总的页数

	protected int		page;						// 本页页号

	protected int		start;						// 起始记录下标(MySql从0开始)
	// =========================================================================================
	/**
	 * 构造方法
	 * 
	 * @param nPageSize
	 *            每页记录数
	 * @param nPage
	 *            本页页号
	 */
	public Pagination(final int nPageSize, final int nPage)
	{
		pageSize = nPageSize; // 每页大小
		page = nPage; // 本页页号
	}

	/**
	 * 构造方法 ,默认每页20条记录
	 * 
	 * @param nPage
	 *            本页页号
	 */
	public Pagination(final int nPage)
	{
		pageSize = DEFAULT_PAGESIZE; // 每页大小
		page = nPage; // 本页页号
	}

	/**
	 * 构造方法 ,默认每页20条记录,显示第一页
	 * 
	 */
	public Pagination()
	{
		pageSize = DEFAULT_PAGESIZE; // 每页大小
		page = DEFAULT_PAGE; // 本页页号
	}

	/**
	 * 分页初始化
	 * 
	 * @param nCount
	 *            总的记录数
	 */
	public void init(final int nCount)
	{
		init(nCount, pageSize, page);
	}

	/**
	 * 分页初始化；记录总记录数，每页记录数，当前页，并计算总页数、本页大小和检测当前页是否有效
	 * 
	 * @param nCount
	 *            总的记录数
	 * @param nPageSize
	 *            每页记录数
	 * @param nPage
	 *            本页页号
	 */
	public void init(final int nCount, final int nPageSize, final int nPage)
	{
		count = nCount; // 总的项数
		page = nPage; // 本页页号
		pageSize = nPageSize; // 每页大小
		if (0 >= pageSize)
		{
			pageSize = DEFAULT_PAGESIZE;
		}
		pageCount = (nCount + pageSize - 1) / pageSize; // 计算总的页数

		// 防止 Page 超范围并计算当前页大小
		if (page > pageCount)
		{
			page = pageCount;
		}
		if (page < 1)
		{
			page = DEFAULT_PAGE;
		}

		start = min();
	}

	/**
	 * 计算起始记录下标(MySql从0开始)
	 * 
	 * @return
	 */
	public int min()
	{
		final int max = page * pageSize - 1;
		return max - pageSize + 1;
	}

	//	public int max()
	//	{
	//		final int max = page * pageSize - 1;
	//		return max;
	//	}

	/**
	 * 计算导航页(开始页号)
	 * 
	 * @param nPageNav
	 *            导航页数
	 * @return 开始页号
	 */
	public final int CalcMinPage(final int nPageNav)
	{
		int min = page - (nPageNav / 2);
		int max = page + (nPageNav / 2);
		if (min < 1)
		{
			final int a = 0 - min;
			min = 1;
			max = max + a;
		}
		if (max > pageCount)
		{
			final int b = max - pageCount;
			max = pageCount;
			min = min - b < 1 ? 1 : min - b;
		}
		return min;
	}

	/**
	 * 计算导航页(结束页号)
	 * 
	 * @param nPageNav
	 *            导航页数
	 * @return 结束页号
	 */
	public final int CalcMaxPage(final int nPageNav)
	{
		int min = page - (nPageNav / 2);
		int max = page + (nPageNav / 2);
		if (min < 1)
		{
			final int a = 0 - min;
			min = 1;
			max = max + a;
		}
		if (max > pageCount)
		{
			final int b = max - pageCount;
			max = pageCount;
			min = min - b < 1 ? 1 : min - b;
		}
		return max;
	}

	@Override
	public String toString()
	{
		final StringBuffer sbf = new StringBuffer();
		sbf.append(" 总的记录数:" + count);
		sbf.append(" 每页记录数:" + pageSize);
		sbf.append(" 总的页数:" + pageCount);
		sbf.append(" 本页页号:" + page);
		sbf.append(" 起始记录下标:" + start);
		return sbf.toString();
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(final int count)
	{
		this.count = count;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public void setPageSize(final int pageSize)
	{
		this.pageSize = pageSize;
	}

	public int getPageCount()
	{
		return pageCount;
	}

	public void setPageCount(final int pageCount)
	{
		this.pageCount = pageCount;
	}

	public int getPage()
	{
		return page;
	}

	public void setPage(final int page)
	{
		this.page = page;
	}

	public int getStart()
	{
		return start;
	}

	public void setStart(final int start)
	{
		this.start = start;
	}


}
