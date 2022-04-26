<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\SayfaController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('home');
});

Route::get('/panel', [SayfaController::class, 'panel']);

Route::get('/home', [SayfaController::class, 'home']);

Route::get('/info', [SayfaController::class, 'info']);

Route::get('/about', [SayfaController::class, 'about']);

Route::get('/contactus', [SayfaController::class, 'contactus']);

Route::get('/version', [SayfaController::class, 'version']);
