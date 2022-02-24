import axios from "axios";
const data_URL = "http://localhost:8080/api/v1/data";
const country_url = "http://localhost:8080/api/v1/country";

class Service1 {
  getCountryData(searchText) {
    // console.log("in service"+searchText)
       return axios.get(country_url + "/" + searchText);
   
  }
  getConData()
  {
    return axios.get(country_url);
  }
}
export default new Service1();
