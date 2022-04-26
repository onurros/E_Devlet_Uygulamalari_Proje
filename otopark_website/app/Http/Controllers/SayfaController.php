<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class SayfaController extends Controller
{
    public function panel()
    {
        return view('panel');
    }

    public function home()
    {
        return view('home');
    }

    public function info()
    {
        return view('info');
    }

    public function about()
    {
        return view('about');
    }

    public function contactus()
    {
        return view('contactus');
    }

    public function version()
    {
        return view('version');
    }
}
