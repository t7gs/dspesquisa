import React, { Props } from 'react';
import { Link } from 'react-router-dom';

type Props1 = {
    link: string;
    linkText: string;
}

const Filters = ({link, linkText}: Props1) => (
    <div className="filters-container records-actions">
        <Link to={link}>
            <button className="action-filters">
                {linkText}
        </button>
        </Link>
    </div>
);

export default Filters;