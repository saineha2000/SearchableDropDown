
import SearchableDropdown from "./Components/SearchableDropDown/SearchableDropDown";
import { useState } from "react";
import { Grid } from "@mui/material";
function App() {
  const country_url = "http://localhost:8080/api/v1/country";
  const [value, setValue] = useState(null);
  const [sname, setSname] = useState(null);
  return (
    <div className="App">
      <Grid sx={{ margin: 5 }}>
        <SearchableDropDown
          prop_name={"name"} //The property which should appear in dropdown
          url={country_url} //The rest Url
          prop_id={"id"} //the property to compare fields .Most probably it would be the primary key of database
          label="select a country" //The label u want to add
          onChange={(val) => {
            setValue(val);
          }}
          isMulti
        />
        <br />
        <SearchableDropDown
          prop_name={"sortname"}
          url={country_url}
          prop_id={"id"}
          label="short names of countries"
          onChange={(val) => {
            setSname(val);
          }}
        />
        <br></br>
        dropdown1:{value !== null && value.name}
        <br></br>
        dropdown2:{sname !== null && sname.sortname}
      </Grid>
    </div>
  );
}

export default App;
