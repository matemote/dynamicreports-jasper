/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2015 Ricardo Mariaca
 * http://www.dynamicreports.org
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.design.base.crosstab;

import net.sf.dynamicreports.design.definition.crosstab.DRIDesignCrosstabCell;

/**
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 */
public class DRDesignCrosstabCell implements DRIDesignCrosstabCell {
	private String name;
	private String rowTotalGroup;
	private String columnTotalGroup;
	private DRDesignCrosstabCellContent content;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getRowTotalGroup() {
		return rowTotalGroup;
	}

	public void setRowTotalGroup(String rowTotalGroup) {
		this.rowTotalGroup = rowTotalGroup;
	}

	@Override
	public String getColumnTotalGroup() {
		return columnTotalGroup;
	}

	public void setColumnTotalGroup(String columnTotalGroup) {
		this.columnTotalGroup = columnTotalGroup;
	}

	@Override
	public DRDesignCrosstabCellContent getContent() {
		return content;
	}

	public void setContent(DRDesignCrosstabCellContent content) {
		this.content = content;
	}
}
