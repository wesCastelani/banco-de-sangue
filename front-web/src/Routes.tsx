import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Doadores from './Doadores/Doadores';
import Home from './Home/Home';
import Nav from './NavBar/Nav';

export default function Routes() {
  return (
    <BrowserRouter>
      <Nav />
      <Switch>
        <Route path="/doadores">
          <Doadores />
        </Route>
        <Route path="">
          <Home />
        </Route>
      </Switch>
    </BrowserRouter>
  );
}
